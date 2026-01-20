
package cz.ivosahlik.ml.features;

public record FeatureVector(
        int sessionFrequency,
        double avgDeposit7d,
        double avgDeposit30d,
        boolean lossChasing
) {}
