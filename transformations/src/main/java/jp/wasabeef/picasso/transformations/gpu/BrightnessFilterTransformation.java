package jp.wasabeef.picasso.transformations.gpu;


import android.content.Context;

import jp.co.cyberagent.android.gpuimage.filter.GPUImageBrightnessFilter;

/**
 * brightness value ranges from -1.0 to 1.0, with 0.0 as the normal level
 */
public class BrightnessFilterTransformation extends GPUFilterTransformation {

  private final float mBrightness;

  public BrightnessFilterTransformation(Context context) {
    this(context, 0.0f);
  }

  public BrightnessFilterTransformation(Context context, float brightness) {
    super(context, new GPUImageBrightnessFilter());
    mBrightness = brightness;
    GPUImageBrightnessFilter filter = getFilter();
    filter.setBrightness(mBrightness);
  }

  @Override
  public String key() {
    return "BrightnessFilterTransformation(brightness=" + mBrightness + ")";
  }
}
