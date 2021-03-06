package video;

import fractals.JuliaFractal;
import fractals.coloring.JuliaColoring;

public class TestAnimator implements Animator {
	
	private JuliaFractal fractal;
	
	public TestAnimator(JuliaFractal fractal) {
		
		this.fractal = fractal;
		
	}
	
	public void animate() {
		
		int max = fractal.getMaxIterations();
		fractal.setMaxIterations(max + 10);
		
		JuliaColoring coloring = fractal.getJuliaColoring();
		coloring.setSteps(max + 10);
		coloring.generateGradientMap();
		
	}

}
