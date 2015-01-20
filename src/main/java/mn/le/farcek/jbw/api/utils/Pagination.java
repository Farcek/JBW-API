/*
 * Copyright (C) 2014 Farcek
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mn.le.farcek.jbw.api.utils;

import java.util.Arrays;


/**
 *
 * @author Farcek
 */
public class Pagination {

    private final Integer totalItems;
    private final Integer pageOfItemCount;
    private final Integer currentPage;
    private final Integer maxPage;

    private final Integer totalPage;
    private final Integer begin;
    private final Integer end;
    private UrlBuilder builder;

    public Pagination(Integer totalItems, Integer pageOfItemCount, Integer currentPage, Integer maxPage, UrlBuilder builder) {
        this.totalItems = totalItems;
        this.pageOfItemCount = pageOfItemCount;

        this.maxPage = maxPage;

        this.totalPage = (int) Math.ceil((double) totalItems / (double) pageOfItemCount);
        this.currentPage = currentPage > totalPage ? totalPage : currentPage;

        this.builder = builder;

        Integer range = maxPage / 2;

        end = this.currentPage + range > this.totalPage ? this.totalPage : this.currentPage + range;
        begin = this.currentPage - range < 1 ? 1 : this.currentPage - range;
    }

    public boolean hasFirst() {
        return begin > 1;
    }

    public boolean isBeginBeforeFirst() {
        return begin == 2;
    }

    public boolean hasLast() {
        return end < totalPage;
    }

    public boolean isEndAfterLast() {
        return end + 1 == totalPage;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public Integer getPageOfItemCount() {
        return pageOfItemCount;
    }

    public Integer getStartItemIndex() {
        Integer f = (currentPage - 1) * pageOfItemCount + 1;
        return f;
    }

    public Integer getEndItemIndex() {
        Integer f = currentPage * pageOfItemCount;
        if (f > totalItems) {
            return totalItems;
        }
        return f;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getMaxPage() {
        return maxPage;
    }

    public java.lang.Iterable<Integer> getPages() {
        Integer n = end - begin + 1;
        Integer[] m = new Integer[n];
        for (Integer i = begin; i <= end; i++) {
            m[i - begin] = i;
        }
        return Arrays.asList(m);
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public Integer getBegin() {
        return begin;
    }

    public Integer getEnd() {
        return end;
    }

    public UrlBuilder getBuilder() {
        if (builder == null) {
            builder = new SampleUrlBuilder();
        }
        return builder;
    }

    @Override
    public String toString() {
        return "Pagination{" + "totalItems=" + totalItems + ", pageOfItemCount=" + pageOfItemCount + ", currentPage=" + currentPage + ", maxPage=" + maxPage + ", totalPage=" + totalPage + ", begin=" + begin + ", end=" + end + '}';
    }

}
