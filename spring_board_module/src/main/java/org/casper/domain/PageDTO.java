package org.casper.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {

	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	// 전체 데이터 수
	private int total;
	// 페이지에서 보여주는 데이터 수(amount)와 현재 페이지 번호(pageNum)을 가지고 있는 객체
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		// cri객체를 통해 사용자의 현재 페이지를 통한 endPage 계산
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage - 9;
		
		// 전제 데이터 수(total)을 고려한 실제 endPage계산
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		
		// 기존의 endPage가 실제 데이터보다 많다면 교체해서 보여줌
		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		
		this.next = this.endPage < realEnd;
	}
}
