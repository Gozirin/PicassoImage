package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;

import jp.co.cyberagent.android.gpuimage.filter.GPUImageContrastFilter;

/**
 * contrast value ranges from 0.0 to 4.0, with 1.0 as the normal level
 */
public class ContrastFilterTransformation extends GPUFilterTransformation {

  private final float mContrast;

  public ContrastFilterTransformation(Context context) {
    this(context, 1.0f);
  }

  public ContrastFilterTransformation(Context context, float contrast) {
    super(context, new GPUImageContrastFilter());
    mContrast = contrast;
    GPUImageContrastFilter filter = getFilter();
    filter.setContrast(mContrast);
  }

  @Override
  public String key() {
    return "ContrastFilterTransformation(contrast=" + mContrast + ")";
  }
}
