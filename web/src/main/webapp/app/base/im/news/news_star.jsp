<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath = request.getContextPath();
%>
<!DOCTYPE html >
<html >
<head >
    <title>公司公告</title>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
    <link rel="stylesheet" type="text/css" href="<%=contextPath%>/vendor/bootstrap-v3.0/css/bootstrap.min.css" >
    <link rel="stylesheet" type="text/css" href="<%=contextPath%>/style/standard/css/eccrm-common-new.css" >
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/jquery-all.js" ></script >
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/angular-all.js" ></script >
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/angular-strap-all.js" ></script >
    <script type="text/javascript" src="<%=contextPath%>/vendor/My97DatePicker/WdatePicker.js" ></script >

    <script type="text/javascript" src="<%=contextPath%>/app/base/im/news/news.js" ></script >

    <script type="text/javascript" >
        window.angular.contextPathURL = '<%=contextPath%>';
    </script >
</head >
<body >
<div class="main condition-row-1" ng-app="eccrm.im.news.star" ng-controller="Ctrl" >
    <div class="list-condition" >
        <div class="block" >
            <div class="block-header" >
                <span class="header-text" >
                    <span class="glyphicons search" ></span >
                        <span>公司公告</span>
                </span >
                <span class="header-button" >
                    <button type="button" class="btn btn-green btn-min" ng-click="query();" >
                        <span class="glyphicons search" ></span >
                        查询
                    </button >
                </span >
            </div >
            <div class="block-content" >
                <div class="content-wrap" >
                    <div class="row" >
                        <div class="form-label col-1-half" >
                            <label >主题:</label >
                        </div >
                        <input class="col-2-half" type="text" ng-model="condition.title" />

                        <div class="form-label col-1-half" >
                            <label >类型:</label >
                        </div >
                        <select ng-model="condition.category" class="col-2-half"
                                ng-options="foo.value as foo.name for foo in newsTypes" >
                        </select >
                    </div >
                </div >
            </div >
        </div >
    </div >
    <div class="list-result " >
        <div class="block" >
            <div class="block-header" >
                <div class="header-text" >
                    <span class="glyphicons list" ></span >
                    <span>公司公告列表</span>
                </div >
            <span class="header-button" >
            </span >
            </div >
            <div class="block-content" >
                <div class="content-wrap" >
                    <div class="table-responsive panel panel-table first-min" >
                        <table class="table table-striped table-hover" >
                            <thead class="table-header" >
                            <tr >
                                <td >主题</td >
                                <td style="width: 120px;" >类型</td >
                                <td style="width: 120px;" >发布时间</td >
                                <td style="width: 120px;" >收藏时间</td >
                                <td >操作</td >
                            </tr >
                            </thead >
                            <tbody class="table-body" >
                            <tr ng-show="!beans || !beans.length" >
                                <td colspan="5" class="text-center" >没有符合条件的记录！</td >
                            </tr >

                            <tr bindonce ng-repeat="foo in beans" >
                                <td title="点击查询明细！" style="cursor: pointer;" >
                                    <a ng-click="view(foo.newsId)"
                                       bo-text="foo.newsTitle |limitTo:30" ></a >
                                </td >
                                <td bo-text="foo.categoryName" ></td >
                                <td bo-text="foo.publishTime | eccrmDate" ></td >
                                <td bo-text="foo.starTime | eccrmDate" ></td >
                                <td class="width-min ta-c">
                                    <a class="btn btn-tiny" title="取消收藏" ng-click="removeStar(foo.newsId)" >
                                        <i class="icons logout" ></i >
                                    </a >
                                </td >
                            </tr >
                            </tbody >
                        </table >
                    </div >
                </div >
            </div >
        </div >
    </div >
    <div class="list-pagination" eccrm-page="pager" ></div >
</div >
</div >
<script type="text/javascript" src="<%=contextPath%>/app/base/im/news/news_star.js" ></script >
</body >
</html >