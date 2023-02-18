package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;

import jp.co.cyberagent.android.gpuimage.filter.GPUImageSepiaToneFilter;

/**
 * Applies a simple sepia effect.
 * <p>
 * The intensity with a default of 1.0.
 */
public class SepiaFilterTransformation extends GPUFilterTransformation {

  private final float mIntensity;

  public SepiaFilterTransformation(Context context) {
    this(context, 1.0f);
  }

  public SepiaFilterTransformation(Context context, float intensity) {
    super(context, new GPUImageSepiaToneFilter());
    mIntensity = intensity;
    GPUImageSepiaToneFilter filter = getFilter();
    filter.setIntensity(mIntensity);
  }

  @Override
  public String key() {
    return "SepiaFilterTransformation(intensity=" + mIntensity + ")";
  }
}
