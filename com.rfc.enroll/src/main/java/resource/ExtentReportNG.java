package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	static ExtentReports extent;

	public static ExtentReports getReportObject() {

		String path = "/home/infibeam/eclipse-workspace/com.rfc.enroll/reports/index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("RFC Enrollment Results");

		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Automation Test Engineer", "Pruthviraj S");

		return extent;

	}

	// ExtentReports , ExtentSparkReporter

}
