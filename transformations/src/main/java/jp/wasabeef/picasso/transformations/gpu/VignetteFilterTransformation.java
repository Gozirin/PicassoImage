package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import android.graphics.PointF;

import java.util.Arrays;

import jp.co.cyberagent.android.gpuimage.filter.GPUImageVignetteFilter;

/**
 * Performs a vignetting effect, fading out the image at the edges
 * The directional intensity of the vignetting,
 * with a default of x = 0.5, y = 0.5, start = 0, end = 0.75
 */
public class VignetteFilterTransformation extends GPUFilterTransformation {

  private final PointF mCenter;
  private final float[] mVignetteColor;
  private final float mVignetteStart;
  private final float mVignetteEnd;

  public VignetteFilterTransformation(Context context) {
    this(context, new PointF(0.5f, 0.5f), new float[]{0.0f, 0.0f, 0.0f}, 0.0f, 0.75f);
  }

  public VignetteFilterTransformation(Context context, PointF center, float[] color, float start,
                                      float end) {
    super(context, new GPUImageVignetteFilter());
    mCenter = center;
    mVignetteColor = color;
    mVignetteStart = start;
    mVignetteEnd = end;
    GPUImageVignetteFilter filter = getFilter();
    filter.setVignetteCenter(mCenter);
    filter.setVignetteColor(mVignetteColor);
    filter.setVignetteStart(mVignetteStart);
    filter.setVignetteEnd(mVignetteEnd);
  }

  @Override
  public String key() {
    return "VignetteFilterTransformation(center=" + mCenter.toString() +
      ",color=" + Arrays.toString(mVignetteColor) +
      ",start=" + mVignetteStart + ",end=" + mVignetteEnd + ")";
  }
}
