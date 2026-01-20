
package cz.ivosahlik.ml.scoring;

import cz.ivosahlik.ml.decision.RiskLevel;

public record RiskResult(double score, RiskLevel level) {}
