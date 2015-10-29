BME 365R Lecture -- 10.27.15
============================

Feedback Systems
--
Cerebellum is a complex feedback system
Slide 2: KNOW THAT FINAL EQUATION FOR CLOSED LOOP FEEDBACK 
	More general term: Gc = kG(s) / (1 + kH(s)G(s))
We will be studying these feedback loops with more mathematical rigor now.
Three advantages to negative feedback:
	1. Stabilizes overall system gain
		deltaGc/Gc = (1/(1+kH))*(deltaK/K)
		Example:
			for a 100% change in feed forward gain (K), what K will produce a 0.1% change in Gc?
			Assume Gc = 10 and H= 1/10
			0.001 = (1/(1+k/10)) (1)
			-> k about = 104
			Drastically improved gain stability
			TAKEAWAY: WE SACRIFICE GAIN TO INCREASE GAIN STABILITY
	2. Feedback reduces distortion
		Eo = (-k / (1+kH))Es + D/(1+kH)
		Sacrifice some gain to decrease harmonic distortion
	3. Feedback improves frequency response
		Eo/Es = (kG(s)/(1+kG(s)H(s))) = Gc
		for kG(s) >> 1, Gc = 1/H(s) (which can become a constant, almost frequency independent)
Slide 9 example:
	Without the feedback loop, gain is high but with a very low frequency response
		w_o = 10^3
	With the addition of a feedback, gain drops but frequency response improves dramatically
		w_o = 10^5
	Principle: Gain-bandwidth product is always constant (equations at bottom right of slide 9)
Slide 10: 
	Application to feedback loop in op-amps
Slide 11:
	Having the appropriate bandwidth to store all the signal is critically important.
	(see photo of Rylander's writing)
Slide 12:
	Break point of about 10 Hz in our ability to track a signal with our finger
	Drop is about -40dB/dec
	Gc = 1/(s+w_o)^2 = 100/(s+10)^2
		This equation is a quantitative measurement of motor capabilities
		*** KNOW HOW TO WRITE TRANSFER FUNCTION BASED ON A BODA PLOT REVIEW THIS FROM CIRCUITS***
Slide 14:
	Bandpass filter is critically important
	lack of a bandpass -> problems with the (1/f) noise, inherent to all linear amplifiers

PID controllers -- proportional-integral-derivative controller
	Slide 18: Controller is calibrated to respond at a particular speed, overshoot, etc.
				Uses proportional gain, integral gain, and derivative gain
	Slide 19: describes these three gains
Mechanics solution
	Open loop solution has steady state error of 1/20
	New problem: make system follow a step function as closely as possible
		Solution: use a closed loop
			H = 1; Gc = KpK / (1+KpK) = Eo/Ei
		PID controller is used with controllable Kp
		No exact solution, but MATLAB modelling results in a numerical solution
		Steady-state error and fairly large overshoot
	Finall, now adding I and D to the PID
		Gc = C(s)K(s) / (1+C(s)K(s))
		After MATLAB modeling, response is very close to what we want.	
		

