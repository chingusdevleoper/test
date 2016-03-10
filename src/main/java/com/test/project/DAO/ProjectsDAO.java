package com.test.project.DAO;

import java.util.ArrayList;
import java.util.List;

public class ProjectsDAO {

	public List<String> loadExistingProjects(){
		
		List<String> existingProjectsList= new ArrayList<String>();
		existingProjectsList.add("Management 1");
		existingProjectsList.add("Management 2");
		existingProjectsList.add("Management 3");
		
		
		return existingProjectsList;
		
	}
}
