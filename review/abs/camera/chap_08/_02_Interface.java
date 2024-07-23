package review.abs.chap_08;

import review.abs.chap_08.camera.FactoryCam;
import review.abs.chap_08.detector.AdvancedFireDetector;
import review.abs.chap_08.detector.FireDetector;
import review.abs.chap_08.reporter.NormalReporter;
import review.abs.chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        NormalReporter normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();

        normalReporter.report();
        videoReporter.report();

        System.out.println("---------------------");

        FireDetector fireDetector = new FireDetector();
        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();

        fireDetector.detect();
        advancedFireDetector.detect();

        System.out.println("---------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(new AdvancedFireDetector());
        factoryCam.setReporter(new VideoReporter());

        factoryCam.detect();
        factoryCam.report();
    }
}
