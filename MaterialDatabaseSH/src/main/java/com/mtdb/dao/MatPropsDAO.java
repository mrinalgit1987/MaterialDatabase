package com.mtdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.mtdb.pojo.Material;

/**
 * 
 * @author amesre Oct 5, 2016
 */
public interface MatPropsDAO {

	/*public String getPerson(String indicatorName, String indicatorValue);

	public List<Material> getData(String username, String password,
			String materialId);

	public List<Material> getMaterials(String username, String password,String materialId);


	public String getPicklist(String picklist);

	public String getMaterialList(String indicatorName, String indicatorValue);

	public String searchMaterials(String searchTerm, String searchType,
			boolean wildCard);

	public String getFileNames(String materialId);

	public String insertMaterial(String matName, String matDescription,
			String parentMaterialId, String processId);*/

	public String allSessionData();

 //   public ArrayList getProcessNames();

	//public ArrayList<String> getParentProcessNames();

	public String gcasSearch(String strGcasId);
}
