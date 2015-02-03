package ptc.jcoe.skillsprofile.template.test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ptc.jcoe.skillsprofile.template.test.cases.BasicTestCase;
import ptc.jcoe.skillsprofile.template.test.cases.ExpectedExceptionTestCase;
import ptc.jcoe.skillsprofile.template.test.cases.IgnoreTestCase;
import ptc.jcoe.skillsprofile.template.test.cases.TimeTestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicTestCase.class,
        ExpectedExceptionTestCase.class,
        IgnoreTestCase.class,
        TimeTestCase.class
})
public class SampleTestSuite {

}
