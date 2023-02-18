package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;

import jp.co.cyberagent.android.gpuimage.filter.GPUImageKuwaharaFilter;

/**
 * Kuwahara all the colors in the image.
 * <p>
 * The radius to sample from when creating the brush-stroke effect, with a default of 25.
 * The larger the radius, the slower the filter.
 */
public class KuwaharaFilterTransformation extends GPUFilterTransformation {

  private final int mRadius;

  public KuwaharaFilterTransformation(Context context) {
    this(context, 25);
  }

  public KuwaharaFilterTransformation(Context context, int radius) {
    super(context, new GPUImageKuwaharaFilter());
    mRadius = radius;
    GPUImageKuwaharaFilter filter = getFilter();
    filter.setRadius(mRadius);
  }

  @Override
  public String key() {
    return "KuwaharaFilterTransformation(radius=" + mRadius + ")";
  }
}
