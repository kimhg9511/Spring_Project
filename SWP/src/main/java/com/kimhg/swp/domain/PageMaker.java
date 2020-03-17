package com.kimhg.swp.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {
	private int displayPageCnt = 10;
	private int totalDataCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private Criteria cri; // has - a 관계

	/**
	 * Criteria를 상속받지 않고 가져다 선언하여 쓰는 이유..? 상속을 받는 대상일지 고민하는 것은 고민하는 대상과 현재 클래스의 관계가
	 * has - a 관계인지 is - a 관계인지에 대하여 확인해 볼 필요가 있다. has - a 관계이면 가져다 사용하기만 하고(주로
	 * 일부분만을 이용) is - a 관계이면 상속하여 사용한다.(주로 다형성을 이용하여 데이터를 처리하는 데에 이용)
	 * 
	 * @param cri
	 */

	// 생성자
	public PageMaker(Criteria cri) {
		// super();
		this.cri = cri;
	}

	// 전체 게시물의 수를 입력 받음
	public void setTotalCount(int totalDataCount) {
		this.totalDataCount = totalDataCount;
		calcData();
	}

	private void calcData() {
		int page = this.cri.getPage();
		int perPageNum = this.cri.getPerPageNum();
//		int page = getPage();
//		int perPageNum = getPerPageNum();

		this.endPage = (int) (Math.ceil(page / (double) displayPageCnt) * displayPageCnt);
		this.startPage = (this.endPage - displayPageCnt) + 1;
		// 실제로 사용되는 페이지의 수
		int tempEndPage = (int) (Math.ceil(totalDataCount / (double) perPageNum));

		if (this.endPage > tempEndPage) {
			this.endPage = tempEndPage;
		}
		this.prev = (startPage != 1);
		this.next = (endPage * perPageNum < totalDataCount);
	}

	public String makeQuery(int page) {
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("perPageNum", this.cri.getPerPageNum());

		if (this.cri.getSearchType() != null) {
			uriComponentsBuilder
			.queryParam("searchType", this.cri.getSearchType())
			.queryParam("keyword", this.cri.getKeyword());
		}

		return uriComponentsBuilder.build().encode().toString();
	}

	public int getDisplayPageCnt() {
		return displayPageCnt;
	}

	public void setDisplayPageCnt(int displayPageCnt) {
		this.displayPageCnt = displayPageCnt;
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

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	public int getTotalDataCount() {
		return totalDataCount;
	}
}
