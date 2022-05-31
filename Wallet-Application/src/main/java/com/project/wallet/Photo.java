package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Photo {
	@Value("20cm length,10cm width")
	private String Dimensionofsize;
	@Value("SIVA/JPEG")
	private String filetype;
	@Value("Seventh sense")
	private String Copyright;
	
	public Photo() {
		System.out.println("object is created:"+this.getClass().getSimpleName());
	}

	public String getDimensionofsize() {
		return Dimensionofsize;
	}

	public void setDimensionofsize(String dimensionofsize) {
		Dimensionofsize = dimensionofsize;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getCopyright() {
		return Copyright;
	}

	public void setCopyright(String copyright) {
		Copyright = copyright;
	}

	@Override
	public String toString() {
		return "Photo [Dimensionofsize=" + Dimensionofsize + ", filetype=" + filetype + ", Copyright=" + Copyright
				+ "]";
	}
	
	
	
	


}
