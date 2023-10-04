---
title: signatures-namespaced.sdf3
hide:
  - toc
---

# `signatures-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/signatures-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/signatures-namespaced.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../strategies-namespaced.sdf3#StrategoLang/sugar/signatures-namespaced_347_387" id="StrategoLang/sugar/signatures-namespaced_7_47" title="Referenced at ../strategies-namespaced.sdf3 line 11">StrategoLang/sugar/signatures-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_59_98" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../constants-namespaced.sdf3#StrategoLang/sugar/constants-namespaced_7_46" id="StrategoLang/sugar/constants-namespaced_102_141" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/sugar/constants-namespaced</a>        
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_145_185" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Sort_538_555" id="StrategoLang-Sort_210_227" title="Referenced at line 12">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortList_228_236" title="Not referenced locally, nor via imports">SortList</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Sort_210_227" id="StrategoLang-Sort_243_260" title="Defined at line 10, 11, 12">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#StrategoLang-Sort_538_555" id="StrategoLang-Sort_345_362" title="Referenced at line 12">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortListTl_363_373" title="Not referenced locally, nor via imports">SortListTl</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Sort_210_227" id="StrategoLang-Sort_380_397" title="Defined at line 10, 11, 12">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#StrategoLang-Sort_210_227" id="StrategoLang-Sort_409_426" title="Defined at line 10, 11, 12">StrategoLang-Sort</a>&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#StrategoLang-Sort_538_555" id="StrategoLang-Sort_504_521" title="Referenced at line 12">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortTuple_522_531" title="Not referenced locally, nor via imports">SortTuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Sort_210_227" id="StrategoLang-Sort_538_555" title="Defined at line 10, 11, 12">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax is being replaced")}

</code></pre></td></tr></tbody></table></div>