/*
 * Copyright (C) 2012 The Provision Team
 *
 * Designer Gwangsu Shin In Provision Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package provision.app.store;

import provision.app.store.ui.SwipeyTabs;
import provision.app.store.ui.SwipeyTabsAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends FragmentActivity {
	private SwipeyTabs mTabs;
	private ViewPager mViewPager;
	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		mViewPager = (ViewPager) findViewById(R.id.viewpager);
		mTabs = (SwipeyTabs) findViewById(R.id.swipeytabs);


		// Add adapter to ViewPager.
		SwipeyTabsPagerAdapter adapter = new SwipeyTabsPagerAdapter(this,
				getSupportFragmentManager());
		mViewPager.setAdapter(adapter);
		mTabs.setAdapter(adapter);
		mViewPager.setOnPageChangeListener(mTabs);

		
		// Default tab is first tab(index 0).
		mViewPager.setCurrentItem(0);

		
	}

	private class SwipeyTabsPagerAdapter extends FragmentPagerAdapter implements SwipeyTabsAdapter {

		private final Context mContext;

			// The tab titles.
		private String[] TITLES = { "프로비전 APP", "테마스토어", "프로비전 ROM"};

		
		
		// The fragment which needs to show on the viewpager.
		private Fragment[] FRAGMENTS = {
				
				new AppStore(),
				new ThemeStore(),
				new RomStore()};
		

		public SwipeyTabsPagerAdapter(Context context, FragmentManager fm) {
			super(fm);
			this.mContext = context;
		}

		@Override
		public Fragment getItem(int position) {
			return FRAGMENTS[position];
		}

		@Override
		public int getCount() {

			// Returns Tab count.
			return TITLES.length;
		}

		public TextView getTab(final int position, SwipeyTabs root) {

			// Set a tab title.
			TextView view = (TextView) LayoutInflater.from(mContext).inflate(
					R.layout.swipey_tab_indicator, root, false);
			view.setText(TITLES[position]);
			view.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
		
					// When user clicks tab title, We need to move to next page.
					mViewPager.setCurrentItem(position);
				}
			});

			return view;
		}
    }
}

