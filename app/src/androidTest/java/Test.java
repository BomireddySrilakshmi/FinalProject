import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import java.util.concurrent.ExecutionException;

public class Test extends AndroidTestCase {
    Context context;
    String test;
    EndpointsAsyncTask endPointsAsyncTask;
    @org.junit.Test
    public void performTest(){
        context = InstrumentationRegistry.getTargetContext();
        try {
            endPointsAsyncTask = new EndpointsAsyncTask();
            endPointsAsyncTask.execute(context);
            test = endPointsAsyncTask.get();
        }
         catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(test);
    }

}
