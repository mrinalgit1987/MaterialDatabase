package com.mtdb.dao;

import java.util.List;

import org.hibernate.Query;

import com.mtdb.model.Project;


public class MatPropsDAOImpl extends  AbstractDAO<Integer, Project> implements MatPropsDAO {

	/*public String getPerson(String indicatorName, String indicatorValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Material> getData(String username, String password,
			String materialId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Material> getMaterials(String username, String password,
			String materialId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPicklist(String picklist) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMaterialList(String indicatorName, String indicatorValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public String searchMaterials(String searchTerm, String searchType,
			boolean wildCard) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFileNames(String materialId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String insertMaterial(String matName, String matDescription,
			String parentMaterialId, String processId) {
		// TODO Auto-generated method stub
		return null;
	}*/
public static void main(String[] args) {
	MatPropsDAOImpl mp=new MatPropsDAOImpl();
	mp.allSessionData();
}
	public String allSessionData() {
		Query query = null;
		//String queryProjects = "SELECT \"ProjectId\",\"Name\" FROM \"Project\" order by \"Name\" asc";
		query = getSession().createQuery("select p.projectId, p.name  from Project p  order by p.name asc");
				
		List<Project> empList = query.list();
		System.out.println("=================="+empList.size());
		
		
		
		return null;
	}

	/*public ArrayList getProcessNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> getParentProcessNames() {
		// TODO Auto-generated method stub
		return null;
	}*/

	public String gcasSearch(String strGcasId) {
		// TODO Auto-generated method stub
		return null;
	}

}
