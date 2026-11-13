package lk.anjalee.clockwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class ClockWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context c, AppWidgetManager m, int[] ids) {
        for (int id : ids) {
            m.updateAppWidget(id, new RemoteViews(c.getPackageName(), R.layout.widget_clock));
        }
    }
}
