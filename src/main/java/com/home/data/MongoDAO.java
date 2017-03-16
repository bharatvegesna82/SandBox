package com.home.data;

import com.home.domain.WhereClause;
import org.json.simple.JSONObject;

import java.util.Dictionary;
import java.util.List;

public interface MongoDAO {

    public JSONObject getData(String collectionName, List<WhereClause> whereClauseList) throws Exception;

    public JSONObject getData(String collectionName) throws Exception;

    public void insertData(String collectionName, Dictionary<String, String> nameValueList) throws Exception;

    public void updateData(String collectionName, Dictionary<String, String> nameValueList, List<WhereClause> whereClauseList) throws Exception;

    public void deleteData(String Collection, List<WhereClause> whereClauseList) throws Exception;
}
