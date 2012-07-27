package provision.app.store.ui;

import android.support.v4.view.PagerAdapter;
import android.widget.TextView;

public interface SwipeyTabsAdapter {

        /**
         * Return the number swipey tabs. Needs to be aligned with the number of
         * items in your {@link PagerAdapter}.
         * 
         * @return
         */
        int getCount();

        /**
         * Build {@link TextView} to diplay as a swipey tab.
         * 
         * @param position the position of the tab
         * @param root the root view
         * @return
         */
        TextView getTab(int position, SwipeyTabs root);

}