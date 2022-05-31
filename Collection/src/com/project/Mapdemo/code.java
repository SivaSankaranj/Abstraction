package com.project.Mapdemo;

public class code implements Comparable<code> {
	private String SectionNo;
	private String LectureNo;
	public code() {
		
	}
	public code(String sectionNo, String lectureNo) {
		super();
		SectionNo = sectionNo;
		LectureNo = lectureNo;
	}
	public String getSectionNo() {
		return SectionNo;
	}
	public void setSectionNo(String sectionNo) {
		SectionNo = sectionNo;
	}
	public String getLectureNo() {
		return LectureNo;
	}
	public void setLectureNo(String lectureNo) {
		LectureNo = lectureNo;
	}
	@Override
	public String toString() {
		return "code [SectionNo=" + SectionNo + ", LectureNo=" + LectureNo + "]";
	}
	@Override
	public int compareTo(code o) {
		String code1=SectionNo.concat(LectureNo);
		String code2=o.getSectionNo()+o.SectionNo;
		return code1.compareTo(code2);
	}
	  




}
