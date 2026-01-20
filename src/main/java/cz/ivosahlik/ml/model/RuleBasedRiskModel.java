
package cz.ivosahlik.ml.model;

import cz.ivosahlik.ml.features.FeatureVector;
import org.springframework.stereotype.Component;

@Component
public class RuleBasedRiskModel implements RiskModel {

    @Override
    public double predict(FeatureVector f) {
        double score = 0;
        if (f.lossChasing()) score += 0.4;
        if (f.avgDeposit7d() > f.avgDeposit30d() * 1.5) score += 0.3;
        if (f.sessionFrequency() > 5) score += 0.2;
        return Math.min(score, 1.0);
    }
}
