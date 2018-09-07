package org.threemusketeerz.flame.sqlbuilder;

public interface IQueryBuilder
{
	public IQueryBuilder start();
	public IQueryBuilder select(String value);
	public IQueryBuilder selectAll();
	public IQueryBuilder from(String value);
	public IQueryBuilder where(String value);
	public Query build();
}

