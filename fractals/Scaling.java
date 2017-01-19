package fractals;

public class Scaling {

	private double xMin;
	private double xMax;
	private double yMin;
	private double yMax;

	public Scaling(double xScaleMin, double xScaleMax, double yScaleMin, double yScaleMax) {

		this.xMin = xScaleMin;
		this.xMax = xScaleMax;
		this.yMin = yScaleMin;
		this.yMax = yScaleMax;

	}

	public double getxMin() {

		return xMin;

	}

	public void setxMin(double xScaleMin) {

		this.xMin = xScaleMin;

	}

	public double getxMax() {
		return xMax;
	}

	public void setxMax(double xScaleMax) {

		this.xMax = xScaleMax;

	}

	public double getyMin() {

		return yMin;

	}

	public void setyMin(double yScaleMin) {

		this.yMin = yScaleMin;

	}

	public double getyMax() {

		return yMax;

	}

	public void setyMax(double yScaleMax) {

		this.yMax = yScaleMax;

	}

	public double getxDifference() {

		return xMax - xMin;

	}

	public double getyDifference() {

		return yMax - yMin;

	}

}