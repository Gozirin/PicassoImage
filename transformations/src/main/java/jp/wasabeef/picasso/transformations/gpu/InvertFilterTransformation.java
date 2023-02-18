package jp.wasabeef.picasso.transformations.gpu;
import android.content.Context;

import jp.co.cyberagent.android.gpuimage.filter.GPUImageColorInvertFilter;

/**
 * Invert all the colors in the image.
 */
public class InvertFilterTransformation extends GPUFilterTransformation {

  public InvertFilterTransformation(Context context) {
    super(context, new GPUImageColorInvertFilter());
  }

  @Override
  public String key() {
    return "InvertFilterTransformation()";
  }
}
