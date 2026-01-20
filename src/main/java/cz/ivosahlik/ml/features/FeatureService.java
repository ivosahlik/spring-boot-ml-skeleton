
package cz.ivosahlik.ml.features;

import org.springframework.stereotype.Service;

@Service
public class FeatureService {

    public FeatureVector extract(PlayerContext ctx) {
        return new FeatureVector(
                ctx.sessionFrequency(),
                ctx.avgDeposit7d(),
                ctx.avgDeposit30d(),
                ctx.lossChasing()
        );
    }
}
