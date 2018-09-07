package org.threemusketeerz.flame.sqlbuilder;

public class QueryBuilder implements IQueryBuilder
{
	private Query query;
	private String select, where, from;
	
	public QueryBuilder()
	{
		query = new Query();
	}

	public QueryBuilder start()
	{
		return this;
	}
	
	public QueryBuilder select(String value)
	{
		select = "SELECT " + value;
		query.append(select);
		return this;
	}
	
	public QueryBuilder selectAll()
	{
		select = "SELECT *";
		query.append(select);
		return this;
	}

	public QueryBuilder where(String value)
	{
		where = "WHERE " + value;
		query.append(where);
		return this;
	}

	public QueryBuilder from(String value)
	{
		from = "FROM " + value;
		query.append(from);
		return this;
	}

	public Query build()
	{
		return query;
	}


}
