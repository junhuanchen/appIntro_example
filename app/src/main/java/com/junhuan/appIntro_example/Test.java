package com.junhuan.appIntro_example;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class Test extends AppIntro implements BlankFragment.OnFragmentInteractionListener {

    BlankFragment blank = new BlankFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle("title");
        sliderPage.setDescription("description");
        sliderPage.setImageDrawable(R.drawable.ic_launcher_background);
        sliderPage.setBgColor(Color.parseColor("#008577"));
        addSlide(AppIntroFragment.newInstance(sliderPage));

        addSlide(blank);

        showSkipButton(true);
        showPagerIndicator(true);
        showSeparator(false);
        showStatusBar(false);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
//        getPager().goToPreviousSlide();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Toast.makeText(Test.this,"this is："+uri,Toast.LENGTH_SHORT).show();
    }
}
