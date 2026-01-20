
package cz.ivosahlik.ml.features;

public record PlayerContext(
        int sessionFrequency,
        double avgDeposit7d,
        double avgDeposit30d,
        boolean lossChasing
) {}
