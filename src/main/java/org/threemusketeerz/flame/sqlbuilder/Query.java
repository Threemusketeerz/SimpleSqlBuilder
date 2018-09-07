package org.threemusketeerz.flame.sqlbuilder;

public class Query
{
	private StringBuilder query;
	
	public Query()
	{
		query = new StringBuilder();
	}
	
	public Query(String query)
	{
		this.query = new StringBuilder();
		this.query.append(query);
	}
	
	public Query append(String val) 
	{
		query.append(val + " ");
		return this;
	}
	
	public String getQuery()
	{
		return query.toString();
	}
	
	public String toString()
	{
		return query.toString();
	}
	
	public String clean(String input)
	{
		return null;
	}
	
}
