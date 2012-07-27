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


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.ImageButton;
import android.widget.LinearLayout;

 

public class AppStore extends Fragment {
	
	@Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 ViewGroup root = (ViewGroup) inflater.inflate(R.layout.appstore, null);
		
		 
		 /** Button **/

	        LinearLayout a = (LinearLayout)root.findViewById(R.id.button1);
	        LinearLayout b = (LinearLayout)root.findViewById(R.id.button2);
	        LinearLayout c = (LinearLayout)root.findViewById(R.id.button3);
	        LinearLayout d = (LinearLayout)root.findViewById(R.id.button4);
	        LinearLayout e = (LinearLayout)root.findViewById(R.id.button5);
	        ImageButton la = (ImageButton)root.findViewById(R.id.icon1);
	        ImageButton lb = (ImageButton)root.findViewById(R.id.icon2);
	        ImageButton lc = (ImageButton)root.findViewById(R.id.icon3);
	        ImageButton ld = (ImageButton)root.findViewById(R.id.icon4);
	        ImageButton le = (ImageButton)root.findViewById(R.id.icon5);
	        
	        
	        a.setOnClickListener(new View.OnClickListener() {
				
				@Override
			public void onClick(View v)
			{
			
				Intent intent = new Intent();
			     intent.setClass(getActivity(), AppInfo.class);     
			     intent.putExtra("app", "netfree");
			        startActivity(intent);  
			}
		});
		
	       b.setOnClickListener(new View.OnClickListener() {
				
				@Override
			public void onClick(View v)
			{
			
				Intent intent = new Intent();
			     intent.setClass(getActivity(), AppInfo.class);     
			     intent.putExtra("app", "netpro");
			        startActivity(intent);  
			}
		});
		
	        	c.setOnClickListener(new View.OnClickListener() {
	        		
	        		@Override
	        		public void onClick(View v)
	        		{
			
				Intent intent = new Intent();
			     intent.setClass(getActivity(), AppInfo.class);     
			     intent.putExtra("app", "opfree");
			        startActivity(intent);  
			}
		});
		
			d.setOnClickListener(new View.OnClickListener() {
	
					@Override
					public void onClick(View v)
					{
			
				Intent intent = new Intent();
			     intent.setClass(getActivity(), AppInfo.class);     
			     intent.putExtra("app", "oppro");
			        startActivity(intent);  
			}
		});
		
		e.setOnClickListener(new View.OnClickListener() {
	
				@Override
					public void onClick(View v)
					{
		
				Intent intent = new Intent();
			     intent.setClass(getActivity(), AppInfo.class);     
			     intent.putExtra("app", "studio");
			        startActivity(intent);  
			}
		});

		la.setOnClickListener(new View.OnClickListener() {
			
			@Override
				public void onClick(View v)
				{
	
	           	Intent intent = new Intent( Intent.ACTION_VIEW );
            	intent.setData( Uri.parse( "market://details?id=provision.netspeed.optimizer" ) );//Provision 3g/4g netspeed optimizer free
            	startActivity( intent );
		}
	});
		lb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{

           	Intent intent = new Intent( Intent.ACTION_VIEW );
        	intent.setData( Uri.parse( "market://details?id=provision.netspeed.optimizer.pro" ) );//Provision 3g/4g netspeed optimizer pro
        	startActivity( intent );
		}
	});
		lc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{

           	Intent intent = new Intent( Intent.ACTION_VIEW );
        	intent.setData( Uri.parse( "market://details?id=provision.optimizer.patch.free" ) );//Provision optimizer free
        	startActivity( intent );
		}
	});
		ld.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{

           	Intent intent = new Intent( Intent.ACTION_VIEW );
        	intent.setData( Uri.parse( "market://details?id=provision.optimizer.patch" ) );//Provision optimizer pro
        	startActivity( intent );
		}
	});
		le.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{

           	Intent intent = new Intent( Intent.ACTION_VIEW );
        	intent.setData( Uri.parse( "market://details?id=provision.root.studio" ) );//Provision Root Studio
        	startActivity( intent );
		}
	});
		
		
		
		return root;
    }
        }