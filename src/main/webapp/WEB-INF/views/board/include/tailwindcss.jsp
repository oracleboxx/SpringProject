<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/tailwindcss">
    main {@apply text-gray-600 container px-5 py-16 mx-auto}
    main > h1 {@apply flex flex-col text-center w-full sm:text-4xl text-2xl font-medium mb-5 text-gray-900}
    article {@apply lg:w-2/3 w-full mx-auto overflow-auto}
    table {@apply table-auto w-full text-xs sm:text-sm}
    table > thead > tr > th {@apply px-2 py-2 sm:px-4 sm:py-3 tracking-wider font-medium text-gray-900 bg-gray-100 text-center whitespace-nowrap align-middle}
    table > thead > tr > th:first-of-type {@apply rounded-tl rounded-bl}
    table > thead > tr > th:nth-of-type(3) {@apply text-left}
    table > thead > tr > th:last-of-type {@apply rounded-tr rounded-br}
    table > tbody > tr {@apply hover:bg-slate-100}
    table > tbody > tr > td {@apply px-2 py-2 sm:px-4 sm:py-3 text-center whitespace-nowrap align-middle}
    table > tbody > tr > td:nth-of-type(3) {@apply p-0 text-left}
    table > tbody > tr > td > a {@apply block}
    table > tbody > tr > td:nth-of-type(3) > a {@apply px-2 py-2 sm:px-4 sm:py-3}
    button.write {@apply flex ml-auto text-white text-sm sm:text-base bg-indigo-500 border-0 py-1 px-3 sm:py-2 sm:px-6 focus:outline-none hover:bg-indigo-600 rounded}
    nav {@apply isolate flex -space-x-px rounded-md mt-2 sm:mt-4 lg:w-2/3 w-full mx-auto justify-center}
    nav > a {@apply relative inline-flex items-center border border-gray-300 bg-white px-4 py-2 text-sm font-medium text-gray-500 focus:z-20}
    nav > a:not(.active) {@apply hover:bg-gray-50}
    nav > a.active {@apply pointer-events-none border-indigo-500 bg-indigo-50 text-indigo-600 z-10}
    nav > a:first-of-type {@apply px-2 rounded-l-md}
    nav > a:last-of-type {@apply px-2 rounded-r-md}
    nav > a.disabled {@apply pointer-events-none bg-slate-200 text-slate-400 border-slate-400}
</style>