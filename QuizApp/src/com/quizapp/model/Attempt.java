package com.quizapp.model;

import java.time.LocalDateTime;

public class Attempt {
	public int id;
	public int quiz_id;
	public int student_id;
	public int score;
	public int total;
	public LocalDateTime attemptTime;
}
