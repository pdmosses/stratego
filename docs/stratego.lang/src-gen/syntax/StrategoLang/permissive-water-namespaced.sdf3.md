---
title: permissive-water-namespaced.sdf3
hide:
  - toc
---

# `permissive-water-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/permissive-water-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/permissive-water-namespaced.sdf3 "The source file on GitHub"

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
13
14
15
16
17
18
19
20
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="StrategoLang/permissive-water-namespaced_7_47" title="Not referenced locally, nor via imports">StrategoLang/permissive-water-namespaced</span>


<span class="keyword">context-free syntax</span>

  <span class="keyword">LAYOUT</span>.<span class="cons_Constructor">WATER</span> = <a href="#StrategoLang-WATER_206_224" id="StrategoLang-WATER_88_106" title="Defined at line 12, 13">StrategoLang-WATER</a> { }

<span class="keyword">sorts</span> <span id="WATER_118_123" title="Not referenced locally, nor via imports">WATER</span><span class="keyword">-LEX</span> <span id="WATERTOKEN_128_138" title="Not referenced locally, nor via imports">WATERTOKEN</span><span class="keyword">-LEX</span> <span id="WATERTOKENSTART_143_158" title="Not referenced locally, nor via imports">WATERTOKENSTART</span><span class="keyword">-LEX</span> <span id="WATERTOKENSEPARATOR_163_182" title="Not referenced locally, nor via imports">WATERTOKENSEPARATOR</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-WATER_88_106" id="StrategoLang-WATER_206_224" title="Referenced at line 6">StrategoLang-WATER</a> = <a href="#StrategoLang-WATERTOKEN_317_340" id="StrategoLang-WATERTOKEN_227_250" title="Defined at line 14">StrategoLang-WATERTOKEN</a> { }
  <a href="#StrategoLang-WATER_88_106" id="StrategoLang-WATER_257_275" title="Referenced at line 6">StrategoLang-WATER</a> = <a href="#StrategoLang-WATERTOKENSEPARATOR_450_482" id="StrategoLang-WATERTOKENSEPARATOR_278_310" title="Defined at line 16">StrategoLang-WATERTOKENSEPARATOR</a> { }
  <a href="#StrategoLang-WATERTOKEN_548_571" id="StrategoLang-WATERTOKEN_317_340" title="Referenced at line 20">StrategoLang-WATERTOKEN</a> = <a href="#StrategoLang-WATERTOKENSTART_393_421" id="StrategoLang-WATERTOKENSTART_343_371" title="Defined at line 15">StrategoLang-WATERTOKENSTART</a> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]* { }
  <a href="#StrategoLang-WATERTOKENSTART_343_371" id="StrategoLang-WATERTOKENSTART_393_421" title="Referenced at line 14">StrategoLang-WATERTOKENSTART</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_] {<span class="keyword">recover</span>}
  <a href="#StrategoLang-WATERTOKENSEPARATOR_278_310" id="StrategoLang-WATERTOKENSEPARATOR_450_482" title="Referenced at line 13">StrategoLang-WATERTOKENSEPARATOR</a> = ~[<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\ \t<span class="cons_Decimal">\12</span>\r\n\*] {<span class="keyword">recover</span>}

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-WATERTOKEN_317_340" id="StrategoLang-WATERTOKEN_548_571" title="Defined at line 14">StrategoLang-WATERTOKEN</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

</code></pre></td></tr></tbody></table></div>