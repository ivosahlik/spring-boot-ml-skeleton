
package cz.ivosahlik.ml.model;

import cz.ivosahlik.ml.features.FeatureVector;

public interface RiskModel {
    double predict(FeatureVector features);
}
