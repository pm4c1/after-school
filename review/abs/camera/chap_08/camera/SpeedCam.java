package review.abs.chap_08.camera;

import review.abs.chap_08.detector.Detectable;
import review.abs.chap_08.reporter.Reportable;

public class SpeedCam extends Camera {
    private Detectable detector;
    private Reportable reporter;

    public SpeedCam() {}

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void takePicture() {
        // Implementation for taking picture
    }

    @Override
    public void recordVideo() {
        // Implementation for recording video
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        if (detector != null) {
            detector.detect();
        }
    }

    public void report() {
        if (reporter != null) {
            reporter.report();
        }
    }
}
