package com.example.newsfeed.webdisplay

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.newsfeed.R
import com.example.newsfeed.databinding.FragmentWebBinding

class WebFragment : Fragment() {
    private lateinit var binding : FragmentWebBinding
    private lateinit var webView : WebView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_web, container, false)
        val url = WebFragmentArgs.fromBundle(requireArguments()).webUrl

        webView = binding.web

        webView.loadUrl(url)

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                binding.web.visibility = View.GONE
                binding.loading.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.web.visibility = View.VISIBLE
                binding.loading.visibility = View.GONE
            }

        }

        webView.settings.setSupportZoom(true)

        return binding.root
    }
}