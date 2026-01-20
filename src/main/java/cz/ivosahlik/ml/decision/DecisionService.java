
package cz.ivosahlik.ml.decision;

import org.springframework.stereotype.Service;

@Service
public class DecisionService {

    public RiskLevel decide(double score) {
        if (score >= 0.8) return RiskLevel.CRITICAL;
        if (score >= 0.6) return RiskLevel.HIGH;
        if (score >= 0.4) return RiskLevel.MEDIUM;
        return RiskLevel.LOW;
    }
}
