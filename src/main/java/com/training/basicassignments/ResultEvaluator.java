package com.training.basicassignments;

public class ResultEvaluator {

	public static String declareResult(int firstsubject, int secondsubject, int thirdsubject) {
		String Statement = null;

		if (firstsubject > 60 && secondsubject > 60 && thirdsubject > 60) {
			Statement = "Passed";
		} else if (firstsubject > 60 && secondsubject > 60 && thirdsubject < 60) {
			Statement = "Promoted";
		} else if (firstsubject > 60 && secondsubject < 60 && thirdsubject < 60) {
			Statement = "Failed";
		} else {
			Statement = "Failed";
		}
		return Statement;

	}

}
