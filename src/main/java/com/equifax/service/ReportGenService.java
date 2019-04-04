package com.equifax.service;

import java.util.List;

public interface ReportGenService {
	public List<Object> genReport(String duration, String from, String to);
}
