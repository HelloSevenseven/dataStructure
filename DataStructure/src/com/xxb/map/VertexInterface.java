package com.xxb.map;

import java.util.Iterator;

public interface VertexInterface {

	public Object getLabel();
	public void visit();
	public void unvisit();
	public boolean isVisited();
	public boolean connect(VertexInterface endVertex , double edgeWeight);
	public boolean connect(VertexInterface endVertex);
	public Iterator<VertexInterface> getNeighborInterator() ;
	public Iterator getWeightIterator();
	public boolean hasNeighbor();
	public VertexInterface getUnvisitedNeighbor();
	
	
}
