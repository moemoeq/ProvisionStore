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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;



public class RomStore extends Fragment{
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 ViewGroup root = (ViewGroup) inflater.inflate(R.layout.romstore, null);
		return root;


    }
        }