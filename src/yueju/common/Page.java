package yueju.common;

import java.util.List;

public class Page {
	private List records;//��ҳ���
	private int pageSize=1;//ÿҳ��ʾ�ļ�¼����
	private int pageNum;//��ǰҳ�롣���û�������
	private int totalPage;//��ҳ����Լ���������ܼ�¼�����ÿҳ��ʾ�ļ�¼����
	private int totalRecordsNum;//�ܼ�¼����count(*)
	private int prePageNum;//��һҳҳ��
	private int nextPageNum;//��һҳҳ��
	private int startIndex;//ÿҳ��ʼ��¼��������Ը�ݵ�ǰ��ҳ���ÿҳ��ʾ�ļ�¼����������
	
	private int startPage;//ҳ��
	private int endPage;
	
	private String url;//��ѯ��ҳ��ݵ������ַ
	
	public Page(int pageNum,int totalRecordsNum){
		this.pageNum = pageNum;
		this.totalRecordsNum = totalRecordsNum;
		//������ҳ��
		totalPage = totalRecordsNum%pageSize==0?totalRecordsNum/pageSize:totalRecordsNum/pageSize+1;
		//����ÿҳ��ʼ������
		startIndex = (pageNum-1)*pageSize;
		//������һҳ����һҳ
		prePageNum=pageNum-1>0?pageNum-1:1;
		nextPageNum=pageNum+1<totalPage?pageNum+1:totalPage;
		//ѡ������̬ҳ��,10��ҳ��
		if(totalPage<=10){
			startPage = 1;
			endPage = totalPage;
		}else{
			//����10ҳ
			startPage = pageNum-5;
			endPage = pageNum+4;
			if(startPage<1){
				startPage = 1;
				endPage = 10;
			}
			if(endPage>totalPage){
				endPage = totalPage;
				startPage = endPage-9;
			}
		}
		
	}
	
	
	public List getRecords() {
		return records;
	}

	public void setRecords(List records) {
		this.records = records;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalRecordsNum() {
		return totalRecordsNum;
	}

	public void setTotalRecordsNum(int totalRecordsNum) {
		this.totalRecordsNum = totalRecordsNum;
	}

	public int getPrePageNum() {
		return prePageNum;
	}

	public void setPrePageNum(int prePageNum) {
		this.prePageNum = prePageNum;
	}

	public int getNextPageNum() {
		return nextPageNum;
	}

	public void setNextPageNum(int nextPageNum) {
		this.nextPageNum = nextPageNum;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}


	public int getStartPage() {
		return startPage;
	}


	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}


	public int getEndPage() {
		return endPage;
	}


	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
}
