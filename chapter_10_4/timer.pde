class Timer {
	int savedTime;			// when Timer started
	int totalTime;			// How long the timer should last

	Timer(int totalTime_) {
		totalTime = totalTime_;
	}

	void start() {
		savedTime = millis();
	}

	boolean isFinished() {
		int passedTime = millis() - savedTime;
		if (passedTime > totalTime){
			return true;
		} else {
			return false;
		}
	}
}