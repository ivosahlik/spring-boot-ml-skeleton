
package cz.ivosahlik.ml.scoring;

import cz.ivosahlik.ml.features.FeatureService;
import cz.ivosahlik.ml.features.PlayerContext;
import cz.ivosahlik.ml.model.RiskModel;
import cz.ivosahlik.ml.decision.DecisionService;
import cz.ivosahlik.ml.decision.RiskLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RiskScoringService {

    private final FeatureService featureService;
    private final RiskModel riskModel;
    private final DecisionService decisionService;

    public RiskResult evaluate(PlayerContext ctx) {
        var features = featureService.extract(ctx);
        double score = riskModel.predict(features);
        RiskLevel level = decisionService.decide(score);
        return new RiskResult(score, level);
    }
}
