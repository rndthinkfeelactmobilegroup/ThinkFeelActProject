package nz.ac.aut.rnd.team.thinkfeelactproject.firsttimeloadup;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import nz.ac.aut.rnd.team.thinkfeelactproject.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Robert on 30/09/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class FirstTimeInitialPageActivityTest{

    @Rule
    public ActivityTestRule<FirstTimeInitialPageActivity> mActivityRule =
            new ActivityTestRule<>(FirstTimeInitialPageActivity.class);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOnCreate() throws Exception {
        onView(withId(R.id.nameInput)).perform(typeText("HELLO"), closeSoftKeyboard());
        onView(withId(R.id.enter)).perform(click());
        onView(withId(R.id.question)).check(matches(withText("Death of a significant person?")));
    }
}