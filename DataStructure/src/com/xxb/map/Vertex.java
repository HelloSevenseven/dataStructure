package com.xxb.map;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Vertex implements VertexInterface{

	private Object label;   //��ʶ����
	private List<Edge> edgeList;   //��ö����ڽӵ�ı�
	private boolean visited; //��ʶ�����Ƿ񱻷���
	private VertexInterface previousVertex;  //�����ǰ���ڵ�
	private double cost;  //�����Ȩֵ,��ߵ�ȨֵҪ������

	
	public Vertex(Object vertexLabel){
		label = vertexLabel;
		//edgeList �����洢������ö����йصı�
		edgeList = new LinkedList<Edge>();
		visited = false;
		previousVertex = null;
		cost = 0;
	}
	
	/**
	 * Edge��������ʶ�ߣ���Ҫ���Ǵ�Ȩֵ�ı�
	 * @author лС��
	 *
	 */
	protected class Edge implements Serializable{
		private VertexInterface vertex;  //�յ�
		private double weight;  //Ȩֵ
		
		protected Edge(VertexInterface endVertex , double edgeWeight){
			vertex = endVertex;
			weight = edgeWeight;
		}
		protected VertexInterface getEndVertex() {
			return vertex;
		}
		protected double getWeight() {
			return weight;
			
		}
	}
	/**
	 * �����ö����ڽӵ�ĵ�����
	 * @author лС��
	 *
	 */
	private class NeighborIterator implements Iterator<VertexInterface>{

		Iterator<Edge> edgesIterator;
		public NeighborIterator() {
			edgesIterator = edgeList.iterator();
		}
		@Override
		public boolean hasNext() {
			return edgesIterator.hasNext();
		}

		@Override
		public VertexInterface next() {
			VertexInterface nextNeighbor = null;
			if(edgesIterator.hasNext()){
				//LinkedList�д洢����edge
				Edge edgeToNextNeighbor = edgesIterator.next();
				//��edge������ȡ������
				nextNeighbor = edgeToNextNeighbor.getEndVertex();
			}
			else{
				throw new NoSuchElementException();
			}
			return nextNeighbor;
			
		}

		@Override
		public void remove() {

			throw new UnsupportedOperationException();
		}
		
	}
	
	/**
	 * ������,�����ö��������ڽӱߵ�Ȩֵ�ĵ�����
	 */
	private class WeightIterator implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public Object getLabel(){
		return label;
	}
	public void visit(){
		this.visited = true;
	}
	public void unvisit(){
		this.visited = false;
	}
	public boolean isVisited() {
		return visited;
	}
	
	public boolean connect(VertexInterface endVertex , double edgeWeight){
		boolean result = false;
		if(!this.equals(endVertex)){
			Iterator<VertexInterface> neighbors = this.getNeighborInterator();
			boolean duplicatEdge = false;
			while(!duplicatEdge && neighbors.hasNext()){
				VertexInterface nextNeighbors = neighbors.next();
				if(endVertex.equals(nextNeighbors)){
					duplicatEdge = true;
					break;
				}
			}
			if(!duplicatEdge){
				edgeList.add(new Edge(endVertex,edgeWeight));
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public boolean connect(VertexInterface endVertex) {
		// TODO Auto-generated method stub
		return connect(endVertex,0);
	}
	@Override
	public Iterator<VertexInterface> getNeighborInterator() {
		// TODO Auto-generated method stub
		return new NeighborIterator();
	}
	@Override
	public Iterator getWeightIterator() {
		// TODO Auto-generated method stub
		return new WeightIterator();
	}
	@Override
	public boolean hasNeighbor() {
		// TODO Auto-generated method stub
		return !(edgeList.isEmpty());
	}
	@Override
	public VertexInterface getUnvisitedNeighbor() {
		VertexInterface result = null;
		Iterator<VertexInterface> neighbors = getNeighborInterator();
		while(neighbors.hasNext() && result ==null){
			VertexInterface nextNeighbor = neighbors.next();
			if(!nextNeighbor.isVisited()){
				result = nextNeighbor;
			}
		}
		return result;
	}
	public void setPredecessor(VertexInterface predecessor){
		this.previousVertex = predecessor;
	}
	public VertexInterface getPredecessor(){
		return this.previousVertex;
	}
	
	public boolean hasPredecessor(){
		return this.previousVertex != null;
	}
	public void setCost(double newCost){
		cost = newCost;
	}
	public boolean equals(Object other){
		boolean result;
		if((other == null)||(getClass()!=other.getClass())){
			result = false;
		}
		else{
			Vertex otherVertex = (Vertex) other;
			result = label.equals(otherVertex.label);	
		}
		return result;
	}
}
