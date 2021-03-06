/*
 * Copyright (c) 2013 Alex Curran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.espian.ribotchallenge.util;

import android.app.Fragment;
import android.view.View;

/**
 * Helper class which allows easy hiding and showing of not yet loaded data.
 */
public class LoadHideHelper {

	private View mTarget;

	/**
	 * Initialise a new LoadHideHelper. Hides the {@link android.view.View} by default.
	 * @param target Fragment to hide the view of (or, to search for R.id.loadeditems in)
	 */
	public LoadHideHelper(Fragment target) {
		mTarget = target.getView();
		initAndHide();
	}

	/**
	 * Initialise a new LoadHideHelper. Hides the {@link android.view.View} by default.
	 * @param target Fragment to hide the view of (or, to search for R.id.loadeditems in)
	 */
	public LoadHideHelper(View target) {
		mTarget = target;
		initAndHide();
	}

	private void initAndHide() {
		mTarget.setAlpha(0f);
	}

	/**
	 * Show the {@link android.view.View}
	 */
	public void show() {
		mTarget.animate().alpha(1f).start();
	}

	/**
	 * Hide the {@link android.view.View}
	 */
	public void hide() {
		mTarget.animate().alpha(0f).start();
	}

}
