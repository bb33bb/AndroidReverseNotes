package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class es extends c {
    private final int height = 75;
    private final int width = 57;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 57;
            case 1:
                return 75;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                k = c.a(k2, looper);
                k.setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-11184811);
                a.setStrokeWidth(3.0f);
                g = c.a(g, 1.0f, 0.0f, -1448.0f, 0.0f, 1.0f, -685.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(1474.4348f, 755.2621f);
                l.cubicTo(1475.5754f, 756.4586f, 1477.4377f, 756.46204f, 1478.5652f, 755.2621f);
                l.cubicTo(1478.5652f, 755.2621f, 1502.0f, 731.94885f, 1502.0f, 712.67706f);
                l.cubicTo(1502.0f, 698.43427f, 1490.5833f, 687.0f, 1476.8696f, 687.0f);
                l.cubicTo(1462.4167f, 687.0f, 1451.0f, 698.43427f, 1451.0f, 712.67706f);
                l.cubicTo(1451.0f, 731.94885f, 1474.4348f, 755.2621f, 1474.4348f, 755.2621f);
                l.close();
                l.moveTo(1476.5f, 721.0f);
                l.cubicTo(1481.1945f, 721.0f, 1485.0f, 717.1944f, 1485.0f, 712.5f);
                l.cubicTo(1485.0f, 707.8056f, 1481.1945f, 704.0f, 1476.5f, 704.0f);
                l.cubicTo(1471.8055f, 704.0f, 1468.0f, 707.8056f, 1468.0f, 712.5f);
                l.cubicTo(1468.0f, 717.1944f, 1471.8055f, 721.0f, 1476.5f, 721.0f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
